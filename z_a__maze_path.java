public class z_a__maze_path
{
    // if diagnol there will be three calls . With increse in both sr and sc
    public static void main(String[] args) {
        
    maze_path(0, 2, 0, 2,"");

    }
    public static void maze_path(int sr,int er,int sc,int ec,String ans) {

        if(sc>ec || sr >er)
        {
            return;
        }
        if(sr==er && ec==sc)
        {
            System.out.println(ans);
            return;
        }

        maze_path(sr, er, sc+1, ec, ans+"H");
        maze_path(sr+1, er, sc, ec, ans+"V");

        // maze_path(sr+1, er, sc+1, ec, ans+"D"); // for diagnoal also
        
        
    }
}