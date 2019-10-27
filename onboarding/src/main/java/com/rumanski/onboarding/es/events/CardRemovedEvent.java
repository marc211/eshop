package com.rumanski.onboarding.es.events;

public class CardRemovedEvent extends OnBoardingAbstractEvent {

	public final Long cardid;

	public CardRemovedEvent(Long cardid) {
		super(EventType.CARD_REMOVED);
		this.cardid = cardid;
	}

}
