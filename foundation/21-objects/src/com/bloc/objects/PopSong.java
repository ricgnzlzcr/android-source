package com.bloc.objects;

class PopSong extends Song {
	// The number of weeks this song stayed on Billboard's top 100
	int mWeeksOnBillboard;

	/*
	 * PopSong
	 *
	 * Side-effects: Assigns some default ensemble, title,
	 *				 year and number of weeks on billboard
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first PopSong constructor
	/************************************************/

	PopSong() {
		super(null, "blank", 1900);
		this.mWeeksOnBillboard = 0;
	}

	/*
	 * PopSong
	 * 
	 * Side-effects: Sets the year of release to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second PopSong constructor
	/************************************************/

	PopSong(Ensemble ensemble, String title) {
		super(ensemble, title);
		this.mWeeksOnBillboard = 0;
	}

	/*
	 * PopSong
	 *
	 * Side-effects: Sets the weeks on billboard to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the third PopSong constructor
	/************************************************/

	PopSong(Ensemble ensemble, String title, int yearReleased) {
		super(ensemble, title, yearReleased);
		this.mWeeksOnBillboard = 0;
	}

	/*
	 * PopSong
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 * @param weeksOnBillboard number of weeks this song lasted on the
	 *		  				   Billboard's top 100 (int)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the fourth PopSong constructor
	/************************************************/

	PopSong(Ensemble ensemble, String title, int yearReleased, int weeksOnBillboard) {
		super(ensemble, title, yearReleased);
		this.mWeeksOnBillboard = weeksOnBillboard;
	}
}