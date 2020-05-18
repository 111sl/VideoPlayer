## day10

### Canvas

1、自定义绘图
2、自定义View时的画布
3、图形变换

画布，使用各种方法来管理Bitmap、GL或者Path路径，同时它可以配合Matrix矩阵类给图像做旋转、缩放等操作，可以用来做动画效果等。同时Canvas类还提供了裁剪、选取等操作。

### Paint

画笔，可以用来设置字体、颜色、样式等。

### 自定义View

继承View,重载onDraw()

view的更新有两种方法，invalidate和postInvalidate，

其中前者是在UI线程自身中使用，而后者在非UI线程中使用。 

### SurfaceView/TextureView

SurfaceView

 	参考：https://blog.csdn.net/android_cmos/article/details/68955134?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase

TextureView

 	参考：https://blog.csdn.net/Andreaw/article/details/88761062

### Touch事件处理机制

​	参考：http://blog.csdn.net/hyp712/article/details/8777835