package com.algo.greedy;

/*
 * You are given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.
Example:

Consider the following 6 activities. 
     start[]  =  {1, 3, 0, 5, 8, 5};
     finish[] =  {2, 4, 6, 7, 9, 9};
The maximum set of activities that can be executed 
by a single person is {0, 1, 3, 4}
 */


public class ActivitySelection {

  /**
   * 
   * @param s start time of activities
   * @param f finish time of activities in sorted order ASC
   */
  private static void printMaxActivities(int s[], int f[]){
    //first task will always be the that's ending first
    int currentTask = 0;
    System.out.println(s[currentTask] + "-" + f[currentTask]);
    for(int futureTask  = currentTask + 1; futureTask < s.length; futureTask++){
      if(s[futureTask] >= f[currentTask]){
        currentTask = futureTask;
        System.out.println(s[currentTask] + "-" + f[currentTask]);
      }
    }
    
  }
  
  
  public static void main(String[] args) {
    int s[] =  {1, 3, 0, 5, 8, 5};
    int f[] =  {2, 4, 6, 7, 9, 9};
    printMaxActivities(s, f);
  }
}
