package org.digidaw.ruangkelas.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import org.digidaw.ruangkelas.R;
import org.digidaw.ruangkelas.Utilitas.UniversalImageLoader;

import de.hdodenhof.circleimageview.CircleImageView;


public class EditProfileFragment extends Fragment {

    private ImageView mSaveBtn;

    private CircleImageView mDisplayImage;
    private EditText mUsername, mDisplayName, mWebiste, mAbout, mEmail, mPhoneNumber;
    private TextView editPhoto;

    private ProgressBar mProgresBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_edit_profile, container, false);
        mDisplayImage = (CircleImageView) view.findViewById(R.id.profile_photo);
        mDisplayName = (EditText) view.findViewById(R.id.displayname);
        mUsername = (EditText) view.findViewById(R.id.username);
        mWebiste = (EditText) view.findViewById(R.id.website);
        mAbout = (EditText) view.findViewById(R.id.bio);
        mEmail = (EditText) view.findViewById(R.id.email);
        mPhoneNumber = (EditText) view.findViewById(R.id.phoneNumber);

        //seting tombol kembali
        ImageView backArrow = (ImageView) view.findViewById(R.id.backButton);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });

        //seting tombol save
        ImageView saveBtn = (ImageView) view.findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveProfileSettings();
            }
        });

        return view;
    }

    private void saveProfileSettings(){
        final String displayName = mDisplayName.getText().toString();
        final String username = mUsername.getText().toString();
        final String website = mWebiste.getText().toString();
        final String bio = mAbout.getText().toString();
        final String email = mEmail.getText().toString();
        final long phone = Long.parseLong(mPhoneNumber.getText().toString());

        //kasus 1, jika user mengubah usernamenya


        //case2: if the user made a change to their email
    }

    private void checkIfUsernameExists(final String username){

    }

    private void setupFirebaseAuth() {

    }
}
