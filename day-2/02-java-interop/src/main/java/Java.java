import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

public class Java {

    static void voidFunction() {
    }

    static @Nullable Integer intFunction(int a, @NotNull Integer b) {
        return 0;
    }

    static @NotNull List<String> listFunction() {
        return new ArrayList<>();
    }

    String field = "";

    String getProperty() {
        return "";
    }

    void setProperty(String value) {
    }

    public static void main(String[] args) {
        Kotlin.unitFunction();
        //Kotlin.nothingFunction();

        Kotlin.intFunction(0, 0).longValue();

        Kotlin.listFunction().add("");
        Kotlin.mutableListFunction().add("");

        Kotlin.getReadOnlyProperty();
        Kotlin.getReadWriteProperty();
        Kotlin.setReadWriteProperty("");

        Kotlin.doSomethingAsync("1", new Continuation<Integer>() {
            @NotNull
            @Override
            public CoroutineContext getContext() {
                return null;
            }

            @Override
            public void resumeWith(@NotNull Object o) {
                Kotlin.doSomethingAsync("2", new Continuation<Integer>() {
                    @NotNull
                    @Override
                    public CoroutineContext getContext() {
                        return null;
                    }

                    @Override
                    public void resumeWith(@NotNull Object o) {
                        Kotlin.doSomethingAsync("3", new Continuation<Integer>() {
                            @NotNull
                            @Override
                            public CoroutineContext getContext() {
                                return null;
                            }

                            @Override
                            public void resumeWith(@NotNull Object o) {

                            }
                        });
                    }
                });
            }
        });

        Animal animal = Animal.Dinosaur.INSTANCE;

        if (animal instanceof Animal.Dog) {
            System.out.println("Dog " + ((Animal.Dog) animal).getLives());
        } else if (animal instanceof Animal.Dinosaur) {
            System.out.println("Dino");
        } else {
            System.out.println("There are no guarantees in Java");
        }
    }
}