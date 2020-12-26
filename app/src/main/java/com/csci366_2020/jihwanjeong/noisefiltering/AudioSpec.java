package com.csci366_2020.jihwanjeong.noisefiltering;

public class AudioSpec
{
    int freq;
    byte channels;

    public AudioSpec(int f, byte chs){
        freq = f;
        channels = chs;
    }

    public int getRate(){
        return freq;
    }

    public byte getChannels() {
        return channels;
    }

}
