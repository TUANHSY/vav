package main;

/**
 * 迷宫问题
 * @author: DX
 * @date: 2019/11/25 16:57
 */
public class MazePathFinding {

    public static final String Y ="<路>";
    public static final String N ="<墙>";
    public static final String P ="<走>";
    /**
     * 随机创建迷宫
     * @param x 长
     * @param y 宽
     */
    public static void createAMaze(int x,int y){
        //二维数组表示迷宫
        String  [][] maze = new String[x][y];
        for (int i=0;i<maze.length;i++){
            for (int j=0;j<maze[0].length;j++){
                if (i==0||j==0||i==maze.length-1||j==maze[0].length-1){
                    maze[i][j]=N;
                }else {
                    int M = Math.random()>0.5?1:0;
                    if (M==0){
//                    有路用空格表示
                        maze[i][j]=N;
                    }else {
//                    没路用#表示
                        maze[i][j]=Y;
                    }

                }
                maze[0][0]="|起|";
                maze[x-1][y-1]="|终|";


            }
        }
        outputMaze(maze);
    }

    /**
     * 输出迷宫
     * @param maze
     */
    private static void outputMaze(String[][] maze){
        for (int i=0;i<maze.length;i++){
            for (int j=0;j<maze[0].length;j++){
               System.out.print( maze[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * 找到一条路径 入口[0][0] 出口 [x][y]
     * @param maze
     * @return
     */
    public static boolean lookingForAnExit(String [][] maze) {
        boolean findAnExit=false;
//        迷宫的长宽
        int x=maze.length,y=maze[0].length;
//        当前位置
        int ix=0,iy=0;
        int S =selectDirection();
        if(S==1){
            //向上
            if( iy==0){
                selectDirection();
            }
        }else if (S==2){
            //向下
        }else if (S==3){
            //向左

        }else{
            //向右

        }






        return findAnExit;
    }

    /**
     *
     * @return 返回一个随机方向
     */
    public static int selectDirection() {
        int R= (int)Math.floor(Math.random()*4)+1;
        //R 在1：上 2：下 3：左 4：右 中随机一个
        System.out.println(R);
        return R;
    }
}
