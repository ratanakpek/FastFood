package rpek.fastfood.di.modules.activities;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import rpek.fastfood.di.components.subcomponents.activities.HomeScreenActivitySubComponent;
import rpek.fastfood.views.activities.HomeScreenActivity;

/**
 * Created by r.pek on 11.10.2017.
 */
@Module(subcomponents = {
        HomeScreenActivitySubComponent.class
})
public abstract class ActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(HomeScreenActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(HomeScreenActivitySubComponent.Builder builder);

}
