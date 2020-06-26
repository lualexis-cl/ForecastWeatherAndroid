package triple.solution.forecastweather.ui.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import triple.solution.forecastweather.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}