package task.enozom.gmailcomposer.composer;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import task.enozom.gmailcomposer.R;
import task.enozom.gmailcomposer.pojos.MessagePojo;

public class MainActivity extends Activity {


    @BindView(R.id.messageSubject)
    EditText messageEnteredSubject;

    @BindView(R.id.messageContent)
    EditText messageEnteredContent;


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

    private static final int PICK_IMAGE_REQUEST = 234;
    private Uri filePath;

    private StorageReference storageReference;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        storageReference = FirebaseStorage.getInstance().getReference();
        mDatabase = FirebaseDatabase.getInstance().getReference("uploads");

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

                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);


            }
            });

        attachmentPopUp.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        attachmentPopUp.show();


    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            filePath = data.getData();
        }
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
