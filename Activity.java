class Activity {

    public static void printact(int activity[][]) {
        for (int i = 0; i < activity.length; i++) {
            for (int j = 0; j < activity[i].length; j++) {
                System.out.print("\t" + activity[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void sort(int array[][]){
        int i, j, unsortedFirst_index;
        int n = array.length;
        
        for(i = 0; i < n -1; i++){
            unsortedFirst_index = i;
            for(j = i+1; j < n; j++){
                if(array[j][2] > array[unsortedFirst_index][2]){
                    unsortedFirst_index = j;
                }
            }
            int tempJob = array[unsortedFirst_index][0];
            int tempDeadline = array[unsortedFirst_index][1];
            int tempProfit = array[unsortedFirst_index][2];
            
            array[unsortedFirst_index][0] = array[i][0];
            array[unsortedFirst_index][1] = array[i][1];
            array[unsortedFirst_index][2] = array[i][2];
            
            array[i][0] = tempJob;
            array[i][1] = tempDeadline;
            array[i][2] = tempProfit;            
            
        }
        
    }

    public static void check(int activity[][]) {
        System.out.print("Following activities are selected\n");
        int j;
        for (int i = 0; i < activity.length; i++) {
            for (j = 0; j < i; j++) {
                if (activity[i][1] == activity[j][1]) {
                    break;
                }
            }
            if (i == j) {
                System.out.print("J" + activity[j][0] + "\n");
            }
        }
    }

    public static void main(String[] args) {
        int[][] activity = {
            {1, 2, 90},
            {2, 2, 20},
            {3, 1, 40},
            {4, 1, 30},
            {5, 4, 65},
            {6, 1, 35},
            {7, 3, 50},
		};
        System.out.print("Shedule before sort\n");
        printact(activity);
        sort(activity);
        System.out.print("Shedule after sort\n");
        printact(activity);
        check(activity);
    }

}
