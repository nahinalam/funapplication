package servlet;
import java.util.Random;

/**
 * 
 */


/**
 * @author nahin_alam
 *
 */
public enum State {
	AK, AL, AR, AZ, CA, CO, CT, DC, DE, FL, 
	GA, HI, IA, ID, IL, IN, KS, KY, LA, MA,
	MD, ME, MI, MN, MO, MS, MT, NC, ND, NE,
	NH, NJ, NM, NV, NY, OH, OK, OR, PA, RI,
	SC, SD, TN, TX, UT, VA, VT, WA, WI, WV, WY;
	
	
	
	public static State randomState() {
	    int pick = new Random().nextInt(State.values().length);
	    return State.values()[pick];
	}

}
