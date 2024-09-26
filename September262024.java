import java.util.TreeMap;

public class September262024 {
    public static void main(String[] args) {

    }
    class MyCalendar {

        TreeMap<Integer,Integer> bookings;
        public MyCalendar() {
            bookings = new TreeMap<>();
        }

        public boolean book(int start, int end) {
            Integer prevBooking = bookings.floorKey(start);
            Integer nextBooking = bookings.ceilingKey(start);
            if((prevBooking==null || start>=bookings.get(prevBooking)) && (nextBooking==null || end<=nextBooking)){
                bookings.put(start,end);
                return true;
            }
            return false;
        }
    }
}
