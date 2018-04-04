# RateBolt
Improve your App Ratings through user feedback


##Install via Gradle
Add the following dependency in your gradle file.
'''dependencies {    
    //your other dependencies here
    compile 'com.neurondigital.ratebolt:ratebolt:0.2.15'
}
'''

##Add a RateView - Basic
Add the RateView to your xml layout file. Replace <API KEY HERE> with your API Key.
  '''<com.neurondigital.ratebolt.RateView xmlns:rateview="http://schemas.android.com/apk/res-auto"
                android:id="@+id/rateview"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                rateview:apiKey="<API KEY HERE>"
                rateview:ratingType="numbers"/>
  '''
  
##Add a RateView - Advanced
###More Options
Change the following parameters for more control:

clearAfterRate - true: resets ui after app is rated. false: the starts will remain highlighted after rating.
frequency - Every how many times does the view show. Set to 0 to always show.
keepVisibleAfterRate - true: view stays visible after rate/feedback. false: view gets hidden after rate/feedback.
log - true: logcat logging on. false: logging off.
rateOnlyOnce - true: always hide when the user rates once. false: Keep showing rate view even if user has rated.
rateUsLink - The user will be taken to the Google play page of the App (url determined automatically from package id). Set this parameter to take the user to another url of your choice for rating.
ratingType - Sets the rating mode. Options available: 'numbers', 'smilies' or 'stars'.
showAfter - Ideally you show the rate prompt after the user had the chance to use the app a couple of times. Set this parameter to set after how many times to show promot. Set to 0 to show immediatly.
textColor - Text and stars color.
textSelectedColor - Highlight color.

Customise Text:
feedbackTitle - Change the default feedback title.
feedbackDescription - Change the default feedback description.
feedbackHint - Change the default feedback hint.
rateUsTitle - Change the default rate prompt title.
rateUsDescription - Change the default rate prompt description.

Example Code with all parameters:
'''<com.neurondigital.ratebolt.RateView xmlns:rateview="http://schemas.android.com/apk/res-auto"
                android:id="@+id/rateview"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                rateview:apiKey="<API KEY HERE>"
                rateview:clearAfterRate="true"
                rateview:feedbackDescription="Would you like to leave us some feedback?"
                rateview:feedbackHint="Your feedback"
                rateview:feedbackTitle="Feedback"
                rateview:rateUsTitle="Rate us"
                rateview:rateUsDescription="Please rate us on Google Play"
                rateview:frequency="0"
                rateview:keepVisibleAfterRate="false"
                rateview:log="true"
                rateview:rateOnlyOnce="false"
                rateview:rateUsLink="http://www.ratebolt.com"
                rateview:ratingType="numbers"
                rateview:showAfter="0"
                rateview:textColor="?android:attr/textColorPrimary"
                rateview:textSelectedColor="?attr/colorAccent" />
  '''
  
##Attach a Parent Container
With ratebolt it is also possible to customise the rate view by adding a container parent which changes its visibility together with the RateView.

Just add a container layout in xml, then set it as the parent of the rateView programatically.

Java code
'''LinearLayout parentContainer = (LinearLayout) findViewById(R.id.parentContainer);
RateView rateView = (RateView) findViewById(R.id.rateview);
rateView.setParentView(parentContainer);
'''

xml layout code
'''
 <LinearLayout
        android:id="@+id/parentContainer"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="8dp"
        android:layout_marginTop="8dp"
        android:orientation="vertical">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="16dp"
            android:orientation="vertical">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Rate us"
                android:textSize="12sp" />

            <com.neurondigital.ratebolt.RateView xmlns:rateview="http://schemas.android.com/apk/res-auto"
                android:id="@+id/rateview"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                rateview:apiKey="<API KEY HERE>"
                rateview:ratingType="numbers"/>
        </LinearLayout>

    </LinearLayout>
'''
