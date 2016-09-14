package com.example.android.tourguidestclairshores;

/**
 * Created by jenniferkocik on 9/14/16.
 */

public class Results {

    /** String resource ID for the name of business */
        private int mNameOfBusiness;

        /** String resource ID for the business address */
        private int mBusinessAddress;

        /** Audio resource ID for the business phone number */
        private int mBusinessPhoneNumber;

        /** Image resource ID for the business */
        private int mImageResourceId;



        /**
         * Create a new Word object.
         *
         */
        public Results(int nameOfBusiness, int businessAddress, int businessPhoneNumber, int imageResourceId) {
            mNameOfBusiness = nameOfBusiness;
            mBusinessAddress = businessAddress;
            mBusinessPhoneNumber = businessPhoneNumber;
            mImageResourceId = imageResourceId;
        }

        /**
         * Get the string resource ID for the name of business
         */
        public int getNameOfBusiness() {
            return mNameOfBusiness;
        }

        /**
         * Get the string resource ID for the business address.
         */
        public int getBusinessAddress() {
            return mBusinessAddress;
        }

        /**
         * Return the image resource ID of business phone number.
         */
        public int getBusinessPhoneNumber() {
            return mBusinessPhoneNumber;
        }

        /**
         * Returns whether or not there is an image for this word.
         */
        public int getmImageResourceId() { return mImageResourceId;}


    }


