package it.saimao.L62_AnonymousInnerClass;

public class MyButton {
    public void setOnClickListener(OnItemClickListener listener) {
        listener.onClick(1, 2);
    }
}
