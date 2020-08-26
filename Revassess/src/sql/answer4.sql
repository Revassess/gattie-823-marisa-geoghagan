SELECT app_user.username, study_set."name", flashcard.question, flashcard.answer FROM app_user
	INNER JOIN study_set ON app_user.user_id = study_set.owner_id
	INNER JOIN study_set_card ON study_set.study_set_id = study_set_card.study_set_id
	INNER JOIN flashcard ON study_set_card.flashcard_id = flashcard.flashcard_id
	WHERE study_set.owner_id = '4';