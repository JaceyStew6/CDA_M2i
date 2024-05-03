package org.example.entity;

public class Castle extends Building {

    private String style;
    private int size;
    private String name;

    private Castle(CastleBuilder builder){
        style = builder.style;
        size = builder.size;
        name = builder.name;
    }

    public static class CastleBuilder extends AbstractBuildingBuilder{

        private String style;
        private int size;
        private String name;

        public CastleBuilder style(String style){
            this.style = style;
            return this;
        }

        public CastleBuilder size(int size){
            this.size = size;
            return this;
        }

        public CastleBuilder name(String name){
            this.name = name;
            return this;
        }

        public Castle build(){
            return new Castle(this);
        }


    }

}
