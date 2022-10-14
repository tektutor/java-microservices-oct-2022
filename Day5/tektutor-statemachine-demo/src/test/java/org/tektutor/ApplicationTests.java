package org.tektutor;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.statemachine.StateMachine;
import org.springframework.test.context.junit4.SpringRunner;

/*transitions.withExternal()
.source(States.BUG_REPORTED)
.target(States.BUG_ASSIGNED)
.event(Events.ASSIGN_BUG_TO_DEVELOPER) //1
.and()
.withExternal()
.source(States.BUG_ASSIGNED)
.target(States.BUG_FIX_INPROGRESS)
.event(Events.START_FIXING_BUG) // 2
.and()
.withExternal()
.source(States.BUG_FIX_INPROGRESS)
.target(States.BUG_READY_FOR_TESTING)
.event(Events.BUG_FIXED) //3
.and()
.withExternal()
.source(States.BUG_READY_FOR_TESTING)
.target(States.BUG_TESTING_INPROGRESS)
.event(Events.BUG_TESTED) //4
.and()
.withExternal()
.source(States.BUG_TESTING_INPROGRESS)
.target(States.BUG_CLOSED)
.event(Events.CLOSE_BUG); //5 */

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {

	@Autowired	
	private StateMachine<States,Events> stateMachine;
	
	/*
	 * @Test public void testInitialState() { Assertions.assertThat(
	 * stateMachine.getState().getId()).isEqualTo(States.BUG_REPORTED); }
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testCompleteStateMachine() {
		stateMachine.sendEvent(Events.ASSIGN_BUG_TO_DEVELOPER);
		stateMachine.sendEvent(Events.START_FIXING_BUG);
		stateMachine.sendEvent(Events.BUG_FIXED);		
		stateMachine.sendEvent(Events.BUG_TESTED);	
		stateMachine.sendEvent(Events.CLOSE_BUG);
		
		Assertions.assertThat( stateMachine.getState().getId())
			.isEqualTo(States.BUG_CLOSED);
	
	}
	
}
