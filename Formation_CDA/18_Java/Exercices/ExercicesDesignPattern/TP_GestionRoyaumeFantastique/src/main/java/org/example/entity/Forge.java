package org.example.entity;

public class Forge extends Building{

    private String style;
    private int size;
    private String name;

    private Forge(ForgeBuilder builder){
        style = builder.style;
        size = builder.size;
        name = builder.name;
    }

    public static class ForgeBuilder extends AbstractBuildingBuilder{
        private String style;
        private int size;
        private String name;

        public ForgeBuilder style(String style){
            this.style = style;
            return this;
        }

        public ForgeBuilder size(int size){
            this.size = size;
            return this;
        }

        public ForgeBuilder name(String name){
            this.name = name;
            return this;
        }

        public Forge build(){
            return new Forge(this);
        }

    }

}
