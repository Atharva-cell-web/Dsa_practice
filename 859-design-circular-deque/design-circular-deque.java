class MyCircularDeque {
    int count;
    int front;
    int rear;
    int K;
    int[] arr;
    public MyCircularDeque(int k) {
        arr=new int[k];
        K=k;
        count=0;
        rear=0;
        front=0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }else{
            
            front=(front-1+K)%K;
            arr[front]=value;
            count++;
            return true;
        }
    }
    
    public boolean insertLast(int value) {
        if(isFull() ){
            return false;
        }else{
            arr[rear]=value;
            rear=(rear+1)%K;
            
            count++;
            return true;
        }
    }
    
    public boolean deleteFront() {
        if(count==0){
            return false;
        }else{
            front=(front +1)%K;
            count--;
            return true;
        }
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }else{
            rear=(rear-1+K)%K;
            count--;
            return true;
        }
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }else{
            return arr[front];
        }
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }else{
            return arr[(rear-1+K)%K];
        }
    }
    
    public boolean isEmpty() {
        if(count==0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isFull() {
        if(count==K){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */