//package assignments;
//
//import java.util.Arrays;
//
//public class TestProject2 {
//	public static void main(String[] args) {
//		public String[] SPECIAL_ITEMS = {"Cactus", "Fork" , "T Shirt"};
//
//	}
//		
//	}
//
//	public String[] buyThreeDiscount(String[] order, boolean isMember) {
//		//TODO
//		int addLength = 0;
//		boolean isDuplicate = false;
//		String[] compare = new String[order.length];
//		for (int j=0; j<SPECIAL_ITEMS.length; j++) {
//			for (int i=0; i<order.length; i++) {
//				if (order[i].equalsIgnoreCase(SPECIAL_ITEMS[j])) {
//					if (OnlineCTStores.getNumberOfItemOccurrences(order, order[i])>=3) {
//						for (int k=0; k<compare.length; k++) {
//							if (order[i].equals(compare[k])) {
//								isDuplicate = true;
//							}
//						}
//						if (isDuplicate == false) {
//							compare[i] = order[i];
//							addLength +=2;
//						}
//						isDuplicate = false;
//					}
//				}
//			}
//		}
//		String[] newOrder = Arrays.copyOf(order, order.length+addLength);
//		int index = 0;
//		for (int i=0; i<order.length; i++) {
//			for (int j=0; j<SPECIAL_ITEMS.length; j++) {
//				if (order[i].equalsIgnoreCase(SPECIAL_ITEMS[j])) {
//					if (getNumberOfItemOccurrences(order, order[i])>=3) {
//						if (order[i].equals(compare[i])) {
//							if (isMember) {
//								newOrder[order.length+index] = order[i];
//								newOrder[order.length+index+1] = order[i];
//								index +=2;
//							} else {
//								newOrder[order.length+index] = order[i];
//								index +=1;
//							}
//						}
//					}
//				}
//			}
//			
//		}
//}
