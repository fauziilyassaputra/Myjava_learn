package hollow.special.operation.data;

// gunakan extends untuk sesama interface
public interface Car extends HasBrand{

   // public abstract adalah default accessnya sehingga tidak perlu diketik ulang
    void drive();

    int getTier();

}

