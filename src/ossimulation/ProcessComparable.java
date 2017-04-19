package ossimulation;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ProcessComparable implements Comparable<Process>, Comparator<Process> {

	public int compare(Process arg0, Process arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
			Function<? super T, ? extends U> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T, U> Comparator<T> comparing(
			Function<? super T, ? extends U> arg0, Comparator<? super U> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingDouble(
			ToDoubleFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> nullsFirst(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> nullsLast(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Process> reversed() {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Process> thenComparing(Comparator<? super Process> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U extends Comparable<? super U>> Comparator<Process> thenComparing(
			Function<? super Process, ? extends U> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U> Comparator<Process> thenComparing(
			Function<? super Process, ? extends U> arg0,
			Comparator<? super U> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Process> thenComparingDouble(
			ToDoubleFunction<? super Process> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Process> thenComparingInt(
			ToIntFunction<? super Process> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Process> thenComparingLong(
			ToLongFunction<? super Process> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public int compareTo(Process arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
