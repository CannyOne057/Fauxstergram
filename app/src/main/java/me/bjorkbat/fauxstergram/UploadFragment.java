package me.bjorkbat.fauxstergram;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by johnborden on 3/17/17.
 */

public class UploadFragment extends Fragment {

    Button mUploadButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_upload, container, false);

        mUploadButton = (Button) rootView.findViewById(R.id.upload);

        mUploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Start activity thing to look for pictures in user's gallery
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                ((MainActivity) getActivity()).startActivityForResult(
                        Intent.createChooser(intent, "Select Picture"),
                        MainActivity.GALLERY_CODE);

            }
        });

        return rootView;
    }
}
