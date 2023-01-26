public class Project3 {

    public static void main(String[] args) {
        class GenericClass<T>{

            private T value;
            public GenericClass(T value){

                this.value = value;

            }
            public T getValue(){

                return value;

            }
            public void setValue(T value){

                this.value = value;

            }

        }
    }
}
