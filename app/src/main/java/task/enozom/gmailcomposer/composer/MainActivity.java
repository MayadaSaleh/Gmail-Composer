package task.enozom.gmailcomposer.composer;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import task.enozom.gmailcomposer.R;

public class MainActivity extends Activity {


    @Nullable
    @BindView(R.id.CameraImage)
    ImageView cameraImageView;

    @Nullable
    @BindView(R.id.galleryImage)
    ImageView GalleryImageView;

    @Nullable
    @BindView(R.id.VideoImageView)
    ImageView VideoImageView;


    Dialog attachmentPopUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        attachmentPopUp = new Dialog(this);

    }



    @OnClick(R.id.attachButton)
    public void attachFile(View view){

        Toast.makeText(MainActivity.this,"ggggggggggggggg",Toast.LENGTH_LONG).show();
        attachmentPopUp.setContentView(R.layout.attachment_pop_up);

        cameraImageView = (ImageView) attachmentPopUp.findViewById(R.id.CameraImage);
        cameraImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"kkkkkkkkkkkkkkkkkkkkkk",Toast.LENGTH_LONG).show();

            }
            });

        attachmentPopUp.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        attachmentPopUp.show();


    }

    @OnClick(R.id.sendButton)
    public void sendfile(View view){

    }

    @Optional
    @OnClick(R.id.VideoImageView)
    public void attachVideo(View view){

    }

    @Optional
    @OnClick(R.id.CameraImage)
    public void openCamera(View view){
        Toast.makeText(MainActivity.this,"hhhhhhhhhhhhhhhh",Toast.LENGTH_LONG).show();

    }



    @Optional
    @OnClick(R.id.galleryImage)
    public void openGallery(View view){

    }

}
