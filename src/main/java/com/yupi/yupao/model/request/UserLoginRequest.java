package com.yupi.yupao.model.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {


    private static final long serialVersionUID = 739627104975423897L;

    private String userAccount;

    private String userPassword;
}
