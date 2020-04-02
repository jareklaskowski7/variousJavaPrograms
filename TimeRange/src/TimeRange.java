/*
 Design a class that will represent a time range: start time to end time
 One possible use for such a class is in scheduling or booking application.
 Example: Conference room will be used from Monday 10am to 12pm
 Create any code constructors, variables and methods that you feel are necessary.
 One such method should test for intersection or conflict in times between 2 instances of TimeRange
 */

import java.util.*;

public class TimeRange {
    private String dayOftheWeek;
    private int startTime;
    private int endTime;
    private static List<int[]> mondayReservations;
    private static List<int[]> tuesdayReservations;
    private static List<int[]> wednesdayReservations;
    private static List<int[]> thursdayReservations;
    private static List<int[]> fridayReservations;
    private static List<int[]> saturdayReservations;
    private static List<int[]> sundayReservations;
    private static Map<String, List<int[]>> weeklyReservations;

    public TimeRange(String dayOftheWeek, int startTime, int endTime) {
        this.dayOftheWeek = dayOftheWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    static {
        mondayReservations = new LinkedList<>();
        tuesdayReservations = new LinkedList<>();
        wednesdayReservations = new LinkedList<>();
        thursdayReservations = new LinkedList<>();
        fridayReservations = new LinkedList<>();
        saturdayReservations = new LinkedList<>();
        sundayReservations = new LinkedList<>();
        weeklyReservations = new LinkedHashMap<>();
        weeklyReservations.put("Monday", mondayReservations);
        weeklyReservations.put("Tuesday", tuesdayReservations);
        weeklyReservations.put("Wednesday", wednesdayReservations);
        weeklyReservations.put("Thursday", thursdayReservations);
        weeklyReservations.put("Friday", fridayReservations);
        weeklyReservations.put("Saturday", saturdayReservations);
        weeklyReservations.put("Sunday", sundayReservations);
    }

    public static List<int[]> getDailyReservations(String dayOftheWeek) {
        return weeklyReservations.get(dayOftheWeek);
    }

    public static Map<String, List<int[]>> getWeeklyReservations() {
        return weeklyReservations;
    }

    public static boolean checkForScheduleConflict(TimeRange tr) {
        boolean conflictExists = false;
        List<int[]> dailyReservations = weeklyReservations.get(tr.dayOftheWeek);
        if (dailyReservations != null) {
            for (int[] dailyReservation : dailyReservations) {
                if (tr.startTime >= dailyReservation[0] && tr.startTime < dailyReservation[1] ||
                        tr.endTime > dailyReservation[0] && tr.endTime <= dailyReservation[1] ||
                        tr.startTime < dailyReservation[0] && tr.endTime > dailyReservation[1]
                ) {
                    conflictExists = true;
                    break;
                }
            }
        }

        return conflictExists;
    }

    public static String reserveTimeSlot(TimeRange tr) {
        StringBuilder conflictResult = new StringBuilder();

        if (!checkForScheduleConflict(tr)) {
            conflictResult
                    .append("There is no conflict with the schedule on ")
                    .append(tr.dayOftheWeek)
                    .append(" between ")
                    .append(tr.startTime)
                    .append(" and ")
                    .append(tr.endTime);
            int[] timeSlot = new int[]{tr.startTime, tr.endTime};
            switch (tr.dayOftheWeek) {
                case "Monday":
                    mondayReservations.add(timeSlot);
                    break;
                case "Tuesday":
                    tuesdayReservations.add(timeSlot);
                    break;
                case "Wednesday":
                    wednesdayReservations.add(timeSlot);
                    break;
                case "Thursday":
                    thursdayReservations.add(timeSlot);
                    break;
                case "Friday":
                    fridayReservations.add(timeSlot);
                    break;
                case "Saturday":
                    saturdayReservations.add(timeSlot);
                    break;
                case "Sunday":
                    sundayReservations.add(timeSlot);
                    break;
                default:
                    conflictResult.delete(0, conflictResult.length() - 1);
                    conflictResult.setLength(0);
                    conflictResult.append("Please choose one of the days of the week!");
            }
        } else {
            conflictResult.setLength(0);
            conflictResult
                    .append("There is a conflict with the schedule on ")
                    .append(tr.dayOftheWeek)
                    .append(" between ")
                    .append(tr.startTime)
                    .append(" and ")
                    .append(tr.endTime);
        }

        return conflictResult.toString();
    }

    public static void main(String[] args) {
        TimeRange tr1 = new TimeRange("Hey", 21, 23);
        TimeRange tr2 = new TimeRange("Wednesday", 15, 20);
        TimeRange tr3 = new TimeRange("Wednesday", 19, 21);
        TimeRange tr4 = new TimeRange("Tuesday", 12, 14);
        TimeRange tr5 = new TimeRange("Tuesday", 18, 21);
        TimeRange tr6 = new TimeRange("Tuesday", 11, 15);
        TimeRange tr7 = new TimeRange("Monday", 14, 16);
        TimeRange tr8 = new TimeRange("Monday", 13, 18);
        TimeRange tr9 = new TimeRange("Monday", 10, 12);

        String conflictResult1 = reserveTimeSlot(tr1);
        System.out.println(conflictResult1);
        String conflictResult2 = reserveTimeSlot(tr2);
        System.out.println(conflictResult2);
        String conflictResult3 = reserveTimeSlot(tr3);
        System.out.println(conflictResult3);
        String conflictResult4 = reserveTimeSlot(tr4);
        System.out.println(conflictResult4);
        String conflictResult5 = reserveTimeSlot(tr5);
        System.out.println(conflictResult5);
        String conflictResult6 = reserveTimeSlot(tr6);
        System.out.println(conflictResult6);
        String conflictResult7 = reserveTimeSlot(tr7);
        System.out.println(conflictResult7);
        String conflictResult8 = reserveTimeSlot(tr8);
        System.out.println(conflictResult8);
        String conflictResult9 = reserveTimeSlot(tr9);
        System.out.println(conflictResult9);
        System.out.println();

        StringBuilder timeSlotReservation = new StringBuilder();

        timeSlotReservation.setLength(0);
        List<int[]> mondayReservations = getDailyReservations("Monday");
        for (int[] mondayReservation : mondayReservations)
            timeSlotReservation
                    .append("There is a time slot reservation between ")
                    .append(mondayReservation[0])
                    .append(" and ")
                    .append(mondayReservation[1])
                    .append("\n");
        System.out.println(timeSlotReservation);

        timeSlotReservation.setLength(0);
        List<int[]> tuesdayReservations = getDailyReservations("Tuesday");
        for (int[] tuesdayReservation : tuesdayReservations)
            timeSlotReservation
                    .append("There is a time slot reservation between ")
                    .append(tuesdayReservation[0])
                    .append(" and ")
                    .append(tuesdayReservation[1])
                    .append("\n");
        System.out.println(timeSlotReservation);

        timeSlotReservation.setLength(0);
        List<int[]> wednesdayReservations = getDailyReservations("Wednesday");
        for (int[] wednesdayReservation : wednesdayReservations)
            timeSlotReservation
                    .append("There is a time slot reservation between ")
                    .append(wednesdayReservation[0])
                    .append(" and ")
                    .append(wednesdayReservation[1])
                    .append("\n");
        System.out.println(timeSlotReservation);

        Map<String, List<int[]>> weeklyReservations = getWeeklyReservations();
        for (Map.Entry<String, List<int[]>> dailyReservations : weeklyReservations.entrySet()) {
            if (dailyReservations.getValue().size() != 0) {
                System.out.println(dailyReservations.getKey() + " Reservations:");
                for (int[] dailyReservation : dailyReservations.getValue())
                    System.out.println("There is a time slot reservation between " + dailyReservation[0] + " and " + dailyReservation[1]);
            }
        }
    }
}
