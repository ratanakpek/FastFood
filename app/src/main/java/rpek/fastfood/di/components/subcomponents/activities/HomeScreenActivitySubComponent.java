package rpek.fastfood.di.components.subcomponents.activities;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import rpek.fastfood.views.activities.HomeScreenActivity;

/**
 * Created by r.pek on 12.10.2017.
 */

@Subcomponent
public interface HomeScreenActivitySubComponent extends AndroidInjector<HomeScreenActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeScreenActivity>{

    }
}
