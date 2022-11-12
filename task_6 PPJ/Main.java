public class Main {
    public static void main(String[] args) {
        int [] result = {0,0,0,0};
        String [] teams = {"Germany","Ireland","Poland", "Scotland"};
        String[][] arr = new String[][]{{"Germany", "2", "Scotland", "1"},
                {"Poland", "2", "Germany", "0"},
                {"Germany","1", "Ireland", "1"},
                {"Poland", "2", "Scotland", "2"},
                {"Scotland","1", "Ireland", "0"},
                {"Ireland", "1", "Poland", "1"},
                {"Ireland", "1", "Scotland","1"},
                {"Germany", "3", "Poland", "1"},
                {"Scotland","2", "Germany","3"},
                {"Ireland", "1", "Germany","0"},
                {"Scotland","2", "Poland", "2"},
                {"Poland", "2", "Ireland", "1"}};

          for(int i=0; i< arr.length;i++){
              System.out.println(arr[i][0]+"\t"+arr[i][1] +"\t"+arr[i][2]+"\t"+arr[i][3]);
          }
          int counter = 0;
          for (String team : teams){
              for (String[] match : arr){
                  int score1 = Integer.parseInt(match[1]);
                  int score2 = Integer.parseInt(match[3]);
                  if(match[0].equals(team)){
                      if(score1>score2)
                          result[counter]+=3;
                      else if(score1==score2)
                          result[counter]+=1;
                  }
                  else if(match[2].equals(team)){
                      if(score2>score1)
                          result[counter]+=3;
                      else if(score1==score2)
                          result[counter]+=1;
                  }
              }
              counter++;
          }

          for(int i=0;i<4;i++){
              System.out.println("Team is:" + teams[i] + " , " + "Result is :"+result[i]);
          }

    }
}
