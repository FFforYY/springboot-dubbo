package com.fy.service;


import com.fy.pojo.Meetingpub;

import java.util.List;

/**
 * Created by Administrator on 2019/11/28 0028.
 */
public interface MeetingPubService {

    List<Meetingpub> findPubByUid(String uid);
}
