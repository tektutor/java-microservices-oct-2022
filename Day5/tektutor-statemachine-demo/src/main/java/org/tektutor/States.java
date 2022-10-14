package org.tektutor;

/* Bug Life Cycle
 * 
 * States - REPORTED --> ASSIGNED --> IN_PROGRESS --> READY_FOR_TESTING --> TESTING --> TEST_COMPLETED 
 * 
 */

public enum States {
	BUG_REPORTED,
	BUG_ASSIGNED,
	BUG_FIX_INPROGRESS,
	BUG_READY_FOR_TESTING,
	BUG_TESTING_INPROGRESS,
	BUG_CLOSED
}