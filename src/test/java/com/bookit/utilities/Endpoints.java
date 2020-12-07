package com.bookit.utilities;

public class Endpoints {
    public static String DELETE_STUDENT = "/api/students/{id}";
    public static String ADD_STUDENT = "/api/students/student";
    public static String GET_ALL_BATCHES = "/api/batches";
    public static String GET_ME = "/api/students/me";
    public static String ADD_BATCH = "/api/batches/batch";
    public static String ADD_TEAM = "/api/teams/team";

    // if those String variables are not static ,we can not call them without creating object of this class!
    // so we MUST make them public static ! so we can direct use them. just use class name.variable name
    // we can call them everywhere too.
}