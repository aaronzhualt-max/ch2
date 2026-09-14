public class Time {
	public static void main (String[] args) {
	int hour = 15;
	int minute = 34;
	int second = 42;
	int midnight = (24*60*60);
	double current_time = minute*60.0+hour*60*60.0+second;
	System.out.println("It has been " + current_time + " seconds since midnight");
	System.out.println(midnight - current_time + " seconds are remaining in the day");
	System.out.println(current_time / midnight * 100 + "% of the day has passed");
	hour = 16;
	minute = 11;
	second = 23;
	int newCurrentTime = minute*60 + hour*60*60 + second;
	System.out.println(newCurrentTime - current_time + " seconds has elapsed since I started working on this exercise");
	}
}
