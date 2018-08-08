# Resources Example

## Uso del resource manager:
  Establecer el idioma de los recursos de los archivos de strings.
  
## Tips de calidad de código:

Antes de nombrar el id del componente, utilizar el nombre del activity y luego el nombre del componente.
Ejemplo: activity_main_my_textView.


```xml

<TextView
    android:id="@+id/activity_main_textView1"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/app_name"
    android:layout_margin="50dp"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintLeft_toLeftOf="parent"
    app:layout_constraintRight_toRightOf="parent"
    app:layout_constraintTop_toTopOf="parent" />

```

## Formato de strigns.


```xml

<resources>
    <string name="app_name">Resources</string>
    <string name="label1">This is a Header %1$s %2$s</string>
    <string name="val1">value 1</string>
    <string name="val2">value 2</string>
</resources>
 
```

Su uso en el código código de java es el siguiente.


```java

mPlaceHolderTextView.setText(getString(R.string.label1,"format 1", "format 1"));
 
```

