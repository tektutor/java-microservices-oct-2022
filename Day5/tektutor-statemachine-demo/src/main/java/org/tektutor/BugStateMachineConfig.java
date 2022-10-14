package org.tektutor;

import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;


/*
public enum States {
	BUG_REPORTED,
	BUG_ASSIGNED,
	BUG_FIX_INPROGRESS,
	BUG_READY_FOR_TESTING,
	BUG_TESTING_PROGRESS,
	BUG_COMPLETED
}

public enum Events {
	ASSIGN_BUG_TO_DEVELOPER,
	START_FIXING_BUG,
	BUG_FIXED,
	ASSIGN_BUG_TO_QA,
	BUG_TESTED
}

*/
@Configuration
@EnableStateMachine
public class BugStateMachineConfig extends EnumStateMachineConfigurerAdapter<States,Events> {

	
	@Override 
	public void configure (
			  StateMachineConfigurationConfigurer<States,Events> config ) throws Exception
	{ 
		  config.withConfiguration() .autoStartup(true); 
	}

	@Override 
	public void configure(
			StateMachineStateConfigurer<States,Events> states ) throws Exception {
	
		states.withStates()
			.initial(States.BUG_REPORTED)
			.state(States.BUG_ASSIGNED)
			.state(States.BUG_FIX_INPROGRESS)
			.state(States.BUG_READY_FOR_TESTING)
			.state(States.BUG_TESTING_INPROGRESS)
			.state(States.BUG_CLOSED);
	}
	
	@Override
	public void configure(
			StateMachineTransitionConfigurer<States, Events> transitions
		) throws Exception {
		
		transitions.withExternal()
			.source(States.BUG_REPORTED)
			.target(States.BUG_ASSIGNED)
			.event(Events.ASSIGN_BUG_TO_DEVELOPER)
			.and()
			.withExternal()
			.source(States.BUG_ASSIGNED)
			.target(States.BUG_FIX_INPROGRESS)
			.event(Events.START_FIXING_BUG)
			.and()
			.withExternal()
			.source(States.BUG_FIX_INPROGRESS)
			.target(States.BUG_READY_FOR_TESTING)
			.event(Events.BUG_FIXED)
			.and()
			.withExternal()
			.source(States.BUG_READY_FOR_TESTING)
			.target(States.BUG_TESTING_INPROGRESS)
			.event(Events.BUG_TESTED)
			.and()
			.withExternal()
			.source(States.BUG_TESTING_INPROGRESS)
			.target(States.BUG_CLOSED)
			.event(Events.CLOSE_BUG);
	}
	
	
}
