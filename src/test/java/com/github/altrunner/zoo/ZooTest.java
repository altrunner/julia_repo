package com.github.altrunner.zoo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ZooTest {

    @Test
    void anEmptyZooShouldBeSilent() {
        Zoo emptyZoo = new Zoo();

        assertThat(emptyZoo.talkToMe()).isEmpty();
    }

    @Test
    void testAZooWithJustOneCat() {
        Zoo zoo = new Zoo(List.of(new Cat()));

        assertThat(zoo.talkToMe()).containsExactly("Meow");
    }

    @Test
    void testAZooWithTwoCats() {
        // TODO add two cats to the zoo
        Zoo zoo = new Zoo(List.of(new Cat(), new Cat()));

        assertThat(zoo.talkToMe()).containsExactly("Meow", "Meow");
    }

    @Test
    void testAZooWithACatAndADog() {
        // TODO we need a Dog...
        Zoo zoo = new Zoo(List.of(new Cat(), new Dog()));

        assertThat(zoo.talkToMe()).containsExactly("Meow", "Woof");
    }

    @Test
    void testALargeZoo() {
        // TODO Just wanted to keep you busy for a while
        Zoo zoo = new Zoo(List.of(new Bird(), new Dog(), new Cat(), new Lion()));

        assertThat(zoo.talkToMe()).containsExactly("Tweet", "Woof", "Meow", "Roar");
    }

    @Test
    void putOlegToTheZoo() {
        // TODO Now you have to smile and implement me
        Zoo zoo = new Zoo(List.of(new Oleg()));

        assertThat(zoo.talkToMe()).containsExactly("Give me a hug and a kiss!");
    }
}