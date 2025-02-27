package ru.aston.TEPLOV_SO.task1.animal;

public abstract class Mammal extends Animal {
    private final String TYPE;
    private Spine spine;

    public Mammal(String name) {
        super(name);
        this.TYPE = "млекопитающее";
        this.spine = new Spine();
    }

    public Mammal() {
        this("");
    }

    public String getType() {
        return this.TYPE + " имею " + spine.getName();
    }

    class Spine {
        private final String NAME;

        private Spine() {
            this.NAME = "позвоночник";
        }

        public String getName() {
            return this.NAME;
        }
    }
}
