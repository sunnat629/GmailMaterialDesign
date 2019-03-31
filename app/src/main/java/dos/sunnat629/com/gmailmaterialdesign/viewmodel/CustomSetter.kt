//package dos.sunnat629.com.gmailmaterialdesign.viewmodel
//
//import android.content.res.Resources
//import android.widget.ImageView
//import com.bumptech.glide.Glide
//import androidx.databinding.BindingAdapter
//import android.graphics.drawable.Drawable
//import android.graphics.drawable.BitmapDrawable
//import android.graphics.Bitmap
//import androidx.databinding.ObservableField
//
//
//class BindableFieldTarget(private val observableField: ObservableField<Drawable>, private val resources: Resources) :
//    Target {
//
//    fun onBitmapLoaded(bitmap: Bitmap, from: Picasso.LoadedFrom) {
//        observableField.set(BitmapDrawable(resources, bitmap))
//    }
//
//    fun onBitmapFailed(errorDrawable: Drawable) {
//        observableField.set(errorDrawable)
//    }
//
//    fun onPrepareLoad(placeHolderDrawable: Drawable) {
//        observableField.set(placeHolderDrawable)
//    }
//}