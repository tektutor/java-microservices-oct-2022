package org.tektutor;

/*public enum States {
	BUG_REPORTED,
	BUG_ASSIGNED,
	BUG_FIX_INPROGRESS,
	BUG_READY_FOR_TESTING,
	BUG_TESTING_PROGRESS,
	BUG_COMPLETED
}
*/

public enum Events {
	ASSIGN_BUG_TO_DEVELOPER,
	START_FIXING_BUG,
	BUG_FIXED,
	ASSIGN_BUG_TO_QA,
	BUG_TESTED,
	CLOSE_BUG
}