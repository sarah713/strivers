import java.util.Arrays;

public class JobSequencing {
    int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, (a, b) -> a.profit - b.profit);
        int maxD = 0;
        for (Job j : arr) {
            if (j.deadline > maxD) {
                maxD = j.deadline;
            }
        }
        int[] maxDead = new int[maxD + 1];
        Arrays.fill(maxDead, -1);
        int profit = 0;
        int cntJobs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) {
                if (maxDead[j] == -1) {
                    maxDead[j] = i;
                    cntJobs++;
                    profit += arr[i].profit;
                    break;
                }
            }
        }
        return new int[] { cntJobs, profit };
    }
}

class Job {
    int id;
    int deadline;
    int profit;

    public Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}