package org.example.entity;

public class Barrack extends Building {
    private String style;
    private int size;
    private String name;

    private Barrack(BarrackBuilder builder){
        style = builder.style;
        size = builder.size;
        name = builder.name;
    }

    public static class BarrackBuilder extends AbstractBuildingBuilder{
        private String style;
        private int size;
        private String name;

        public BarrackBuilder style(String style){
            this.style = style;
            return this;
        }
        public BarrackBuilder size(int size){
            this.size = size;
            return this;
        }
        public BarrackBuilder name(String name){
            this.name = name;
            return this;
        }

        public Barrack build(){
            return new Barrack(this);
        }

    }

}
