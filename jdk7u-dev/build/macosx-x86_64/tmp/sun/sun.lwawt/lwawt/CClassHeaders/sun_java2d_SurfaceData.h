/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class sun_java2d_SurfaceData */

#ifndef _Included_sun_java2d_SurfaceData
#define _Included_sun_java2d_SurfaceData
#ifdef __cplusplus
extern "C" {
#endif
#undef sun_java2d_SurfaceData_LOOP_UNKNOWN
#define sun_java2d_SurfaceData_LOOP_UNKNOWN 0L
#undef sun_java2d_SurfaceData_LOOP_FOUND
#define sun_java2d_SurfaceData_LOOP_FOUND 1L
#undef sun_java2d_SurfaceData_LOOP_NOTFOUND
#define sun_java2d_SurfaceData_LOOP_NOTFOUND 2L
/*
 * Class:     sun_java2d_SurfaceData
 * Method:    initIDs
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_sun_java2d_SurfaceData_initIDs
  (JNIEnv *, jclass);

/*
 * Class:     sun_java2d_SurfaceData
 * Method:    isOpaqueGray
 * Signature: (Ljava/awt/image/IndexColorModel;)Z
 */
JNIEXPORT jboolean JNICALL Java_sun_java2d_SurfaceData_isOpaqueGray
  (JNIEnv *, jclass, jobject);

#ifdef __cplusplus
}
#endif
#endif
