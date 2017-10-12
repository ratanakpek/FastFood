package rpek.fastfood.di.components.subcomponents;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import rpek.fastfood.FoodApplication;
import rpek.fastfood.di.modules.activities.ActivityModule;

/**
 * Created by r.pek on 11.10.2017.
 */
@Singleton
@Component(modules={
        AndroidInjectionModule.class,
        ActivityModule.class,


})
public interface AppComponents {
        void inject(FoodApplication application);
}
