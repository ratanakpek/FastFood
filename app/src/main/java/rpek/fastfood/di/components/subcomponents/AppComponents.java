package rpek.fastfood.di.components.subcomponents;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import rpek.fastfood.FoodApplication;

/**
 * Created by r.pek on 11.10.2017.
 */
@Singleton
@Component(modules={
        AndroidInjectionModule.class
})
public interface AppComponents {
        void inject(FoodApplication application);
}
