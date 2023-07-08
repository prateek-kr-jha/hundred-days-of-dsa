public class ResizingStack<Item> {
        private Item[] stack = (Item[]) new Object[1];
        private int size = 0;
        public boolean isEmpty(){
            return size == 0;
        }

        public int size(){
            return size;
        }

        public void push(Item item){
            if(size == stack.length){
                resize(size * 2);
            }
            stack[size++] = item;
        }

        public Item pop(){
            return stack[--size];
        }

        private void resize(int max){
            Item[] temp = (Item[]) new Object[max];
            for(int i = 0; i < size; i++){
                temp[i] = stack[i];
            }
            stack = temp;
        }
        public void stackType(){
            System.out.println("Resizing Stack");
        }

}
