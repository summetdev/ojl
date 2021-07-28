package io.summetdev.ojl.graphics.gl;

import java.nio.*;

/**
 * Interface wrapping all the methods of OpenGL ES 3.0
 */
@SuppressWarnings("unused")
public interface GL30 extends GL20 {
    int GL_READ_BUFFER = 0x0C02;
    int GL_UNPACK_ROW_LENGTH = 0x0CF2;
    int GL_UNPACK_SKIP_ROWS = 0x0CF3;
    int GL_UNPACK_SKIP_PIXELS = 0x0CF4;
    int GL_PACK_ROW_LENGTH = 0x0D02;
    int GL_PACK_SKIP_ROWS = 0x0D03;
    int GL_PACK_SKIP_PIXELS = 0x0D04;
    int GL_COLOR = 0x1800;
    int GL_DEPTH = 0x1801;
    int GL_STENCIL = 0x1802;
    int GL_RED = 0x1903;
    int GL_RGB8 = 0x8051;
    int GL_RGBA8 = 0x8058;
    int GL_RGB10_A2 = 0x8059;
    int GL_TEXTURE_BINDING_3D = 0x806A;
    int GL_UNPACK_SKIP_IMAGES = 0x806D;
    int GL_UNPACK_IMAGE_HEIGHT = 0x806E;
    int GL_TEXTURE_3D = 0x806F;
    int GL_TEXTURE_WRAP_R = 0x8072;
    int GL_MAX_3D_TEXTURE_SIZE = 0x8073;
    int GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;
    int GL_MAX_ELEMENTS_VERTICES = 0x80E8;
    int GL_MAX_ELEMENTS_INDICES = 0x80E9;
    int GL_TEXTURE_MIN_LOD = 0x813A;
    int GL_TEXTURE_MAX_LOD = 0x813B;
    int GL_TEXTURE_BASE_LEVEL = 0x813C;
    int GL_TEXTURE_MAX_LEVEL = 0x813D;
    int GL_MIN = 0x8007;
    int GL_MAX = 0x8008;
    int GL_DEPTH_COMPONENT24 = 0x81A6;
    int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;
    int GL_TEXTURE_COMPARE_MODE = 0x884C;
    int GL_TEXTURE_COMPARE_FUNC = 0x884D;
    int GL_CURRENT_QUERY = 0x8865;
    int GL_QUERY_RESULT = 0x8866;
    int GL_QUERY_RESULT_AVAILABLE = 0x8867;
    int GL_BUFFER_MAPPED = 0x88BC;
    int GL_BUFFER_MAP_POINTER = 0x88BD;
    int GL_STREAM_READ = 0x88E1;
    int GL_STREAM_COPY = 0x88E2;
    int GL_STATIC_READ = 0x88E5;
    int GL_STATIC_COPY = 0x88E6;
    int GL_DYNAMIC_READ = 0x88E9;
    int GL_DYNAMIC_COPY = 0x88EA;
    int GL_MAX_DRAW_BUFFERS = 0x8824;
    int GL_DRAW_BUFFER0 = 0x8825;
    int GL_DRAW_BUFFER1 = 0x8826;
    int GL_DRAW_BUFFER2 = 0x8827;
    int GL_DRAW_BUFFER3 = 0x8828;
    int GL_DRAW_BUFFER4 = 0x8829;
    int GL_DRAW_BUFFER5 = 0x882A;
    int GL_DRAW_BUFFER6 = 0x882B;
    int GL_DRAW_BUFFER7 = 0x882C;
    int GL_DRAW_BUFFER8 = 0x882D;
    int GL_DRAW_BUFFER9 = 0x882E;
    int GL_DRAW_BUFFER10 = 0x882F;
    int GL_DRAW_BUFFER11 = 0x8830;
    int GL_DRAW_BUFFER12 = 0x8831;
    int GL_DRAW_BUFFER13 = 0x8832;
    int GL_DRAW_BUFFER14 = 0x8833;
    int GL_DRAW_BUFFER15 = 0x8834;
    int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;
    int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A;
    int GL_SAMPLER_3D = 0x8B5F;
    int GL_SAMPLER_2D_SHADOW = 0x8B62;
    int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;
    int GL_PIXEL_PACK_BUFFER = 0x88EB;
    int GL_PIXEL_UNPACK_BUFFER = 0x88EC;
    int GL_PIXEL_PACK_BUFFER_BINDING = 0x88ED;
    int GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;
    int GL_FLOAT_MAT2x3 = 0x8B65;
    int GL_FLOAT_MAT2x4 = 0x8B66;
    int GL_FLOAT_MAT3x2 = 0x8B67;
    int GL_FLOAT_MAT3x4 = 0x8B68;
    int GL_FLOAT_MAT4x2 = 0x8B69;
    int GL_FLOAT_MAT4x3 = 0x8B6A;
    int GL_SRGB = 0x8C40;
    int GL_SRGB8 = 0x8C41;
    int GL_SRGB8_ALPHA8 = 0x8C43;
    int GL_COMPARE_REF_TO_TEXTURE = 0x884E;
    int GL_MAJOR_VERSION = 0x821B;
    int GL_MINOR_VERSION = 0x821C;
    int GL_NUM_EXTENSIONS = 0x821D;
    int GL_RGBA32F = 0x8814;
    int GL_RGB32F = 0x8815;
    int GL_RGBA16F = 0x881A;
    int GL_RGB16F = 0x881B;
    int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;
    int GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;
    int GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904;
    int GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;
    int GL_MAX_VARYING_COMPONENTS = 0x8B4B;
    int GL_TEXTURE_2D_ARRAY = 0x8C1A;
    int GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D;
    int GL_R11F_G11F_B10F = 0x8C3A;
    int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;
    int GL_RGB9_E5 = 0x8C3D;
    int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;
    int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;
    int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;
    int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;
    int GL_TRANSFORM_FEEDBACK_VARYINGS = 0x8C83;
    int GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;
    int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;
    int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;
    int GL_RASTERIZER_DISCARD = 0x8C89;
    int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
    int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;
    int GL_INTERLEAVED_ATTRIBS = 0x8C8C;
    int GL_SEPARATE_ATTRIBS = 0x8C8D;
    int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;
    int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;
    int GL_RGBA32UI = 0x8D70;
    int GL_RGB32UI = 0x8D71;
    int GL_RGBA16UI = 0x8D76;
    int GL_RGB16UI = 0x8D77;
    int GL_RGBA8UI = 0x8D7C;
    int GL_RGB8UI = 0x8D7D;
    int GL_RGBA32I = 0x8D82;
    int GL_RGB32I = 0x8D83;
    int GL_RGBA16I = 0x8D88;
    int GL_RGB16I = 0x8D89;
    int GL_RGBA8I = 0x8D8E;
    int GL_RGB8I = 0x8D8F;
    int GL_RED_INTEGER = 0x8D94;
    int GL_RGB_INTEGER = 0x8D98;
    int GL_RGBA_INTEGER = 0x8D99;
    int GL_SAMPLER_2D_ARRAY = 0x8DC1;
    int GL_SAMPLER_2D_ARRAY_SHADOW = 0x8DC4;
    int GL_SAMPLER_CUBE_SHADOW = 0x8DC5;
    int GL_UNSIGNED_INT_VEC2 = 0x8DC6;
    int GL_UNSIGNED_INT_VEC3 = 0x8DC7;
    int GL_UNSIGNED_INT_VEC4 = 0x8DC8;
    int GL_INT_SAMPLER_2D = 0x8DCA;
    int GL_INT_SAMPLER_3D = 0x8DCB;
    int GL_INT_SAMPLER_CUBE = 0x8DCC;
    int GL_INT_SAMPLER_2D_ARRAY = 0x8DCF;
    int GL_UNSIGNED_INT_SAMPLER_2D = 0x8DD2;
    int GL_UNSIGNED_INT_SAMPLER_3D = 0x8DD3;
    int GL_UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4;
    int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;
    int GL_BUFFER_ACCESS_FLAGS = 0x911F;
    int GL_BUFFER_MAP_LENGTH = 0x9120;
    int GL_BUFFER_MAP_OFFSET = 0x9121;
    int GL_DEPTH_COMPONENT32F = 0x8CAC;
    int GL_DEPTH32F_STENCIL8 = 0x8CAD;
    int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;
    int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;
    int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;
    int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;
    int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;
    int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;
    int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;
    int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;
    int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;
    int GL_FRAMEBUFFER_DEFAULT = 0x8218;
    int GL_FRAMEBUFFER_UNDEFINED = 0x8219;
    int GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;
    int GL_DEPTH_STENCIL = 0x84F9;
    int GL_UNSIGNED_INT_24_8 = 0x84FA;
    int GL_DEPTH24_STENCIL8 = 0x88F0;
    int GL_UNSIGNED_NORMALIZED = 0x8C17;
    int GL_DRAW_FRAMEBUFFER_BINDING = GL_FRAMEBUFFER_BINDING;
    int GL_READ_FRAMEBUFFER = 0x8CA8;
    int GL_DRAW_FRAMEBUFFER = 0x8CA9;
    int GL_READ_FRAMEBUFFER_BINDING = 0x8CAA;
    int GL_RENDERBUFFER_SAMPLES = 0x8CAB;
    int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
    int GL_MAX_COLOR_ATTACHMENTS = 0x8CDF;
    int GL_COLOR_ATTACHMENT1 = 0x8CE1;
    int GL_COLOR_ATTACHMENT2 = 0x8CE2;
    int GL_COLOR_ATTACHMENT3 = 0x8CE3;
    int GL_COLOR_ATTACHMENT4 = 0x8CE4;
    int GL_COLOR_ATTACHMENT5 = 0x8CE5;
    int GL_COLOR_ATTACHMENT6 = 0x8CE6;
    int GL_COLOR_ATTACHMENT7 = 0x8CE7;
    int GL_COLOR_ATTACHMENT8 = 0x8CE8;
    int GL_COLOR_ATTACHMENT9 = 0x8CE9;
    int GL_COLOR_ATTACHMENT10 = 0x8CEA;
    int GL_COLOR_ATTACHMENT11 = 0x8CEB;
    int GL_COLOR_ATTACHMENT12 = 0x8CEC;
    int GL_COLOR_ATTACHMENT13 = 0x8CED;
    int GL_COLOR_ATTACHMENT14 = 0x8CEE;
    int GL_COLOR_ATTACHMENT15 = 0x8CEF;
    int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;
    int GL_MAX_SAMPLES = 0x8D57;
    int GL_HALF_FLOAT = 0x140B;
    int GL_MAP_READ_BIT = 0x0001;
    int GL_MAP_WRITE_BIT = 0x0002;
    int GL_MAP_INVALIDATE_RANGE_BIT = 0x0004;
    int GL_MAP_INVALIDATE_BUFFER_BIT = 0x0008;
    int GL_MAP_FLUSH_EXPLICIT_BIT = 0x0010;
    int GL_MAP_UNSYNCHRONIZED_BIT = 0x0020;
    int GL_RG = 0x8227;
    int GL_RG_INTEGER = 0x8228;
    int GL_R8 = 0x8229;
    int GL_RG8 = 0x822B;
    int GL_R16F = 0x822D;
    int GL_R32F = 0x822E;
    int GL_RG16F = 0x822F;
    int GL_RG32F = 0x8230;
    int GL_R8I = 0x8231;
    int GL_R8UI = 0x8232;
    int GL_R16I = 0x8233;
    int GL_R16UI = 0x8234;
    int GL_R32I = 0x8235;
    int GL_R32UI = 0x8236;
    int GL_RG8I = 0x8237;
    int GL_RG8UI = 0x8238;
    int GL_RG16I = 0x8239;
    int GL_RG16UI = 0x823A;
    int GL_RG32I = 0x823B;
    int GL_RG32UI = 0x823C;
    int GL_VERTEX_ARRAY_BINDING = 0x85B5;
    int GL_R8_SNORM = 0x8F94;
    int GL_RG8_SNORM = 0x8F95;
    int GL_RGB8_SNORM = 0x8F96;
    int GL_RGBA8_SNORM = 0x8F97;
    int GL_SIGNED_NORMALIZED = 0x8F9C;
    int GL_PRIMITIVE_RESTART_FIXED_INDEX = 0x8D69;
    int GL_COPY_READ_BUFFER = 0x8F36;
    int GL_COPY_WRITE_BUFFER = 0x8F37;
    int GL_COPY_READ_BUFFER_BINDING = GL_COPY_READ_BUFFER;
    int GL_COPY_WRITE_BUFFER_BINDING = GL_COPY_WRITE_BUFFER;
    int GL_UNIFORM_BUFFER = 0x8A11;
    int GL_UNIFORM_BUFFER_BINDING = 0x8A28;
    int GL_UNIFORM_BUFFER_START = 0x8A29;
    int GL_UNIFORM_BUFFER_SIZE = 0x8A2A;
    int GL_MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;
    int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D;
    int GL_MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;
    int GL_MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F;
    int GL_MAX_UNIFORM_BLOCK_SIZE = 0x8A30;
    int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;
    int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;
    int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;
    int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35;
    int GL_ACTIVE_UNIFORM_BLOCKS = 0x8A36;
    int GL_UNIFORM_TYPE = 0x8A37;
    int GL_UNIFORM_SIZE = 0x8A38;
    int GL_UNIFORM_NAME_LENGTH = 0x8A39;
    int GL_UNIFORM_BLOCK_INDEX = 0x8A3A;
    int GL_UNIFORM_OFFSET = 0x8A3B;
    int GL_UNIFORM_ARRAY_STRIDE = 0x8A3C;
    int GL_UNIFORM_MATRIX_STRIDE = 0x8A3D;
    int GL_UNIFORM_IS_ROW_MAJOR = 0x8A3E;
    int GL_UNIFORM_BLOCK_BINDING = 0x8A3F;
    int GL_UNIFORM_BLOCK_DATA_SIZE = 0x8A40;
    int GL_UNIFORM_BLOCK_NAME_LENGTH = 0x8A41;
    int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42;
    int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;
    int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;
    int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;
    // GL_INVALID_INDEX is defined as 0xFFFFFFFFu in C.
    int GL_INVALID_INDEX = -1;
    int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;
    int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;
    int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;
    int GL_OBJECT_TYPE = 0x9112;
    int GL_SYNC_CONDITION = 0x9113;
    int GL_SYNC_STATUS = 0x9114;
    int GL_SYNC_FLAGS = 0x9115;
    int GL_SYNC_FENCE = 0x9116;
    int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;
    int GL_UNSIGNALED = 0x9118;
    int GL_SIGNALED = 0x9119;
    int GL_ALREADY_SIGNALED = 0x911A;
    int GL_TIMEOUT_EXPIRED = 0x911B;
    int GL_CONDITION_SATISFIED = 0x911C;
    int GL_WAIT_FAILED = 0x911D;
    int GL_SYNC_FLUSH_COMMANDS_BIT = 0x00000001;
    // GL_TIMEOUT_IGNORED is defined as 0xFFFFFFFFFFFFFFFFull in C.
    long GL_TIMEOUT_IGNORED = -1;
    int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;
    int GL_ANY_SAMPLES_PASSED = 0x8C2F;
    int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;
    int GL_SAMPLER_BINDING = 0x8919;
    int GL_RGB10_A2UI = 0x906F;
    int GL_TEXTURE_SWIZZLE_R = 0x8E42;
    int GL_TEXTURE_SWIZZLE_G = 0x8E43;
    int GL_TEXTURE_SWIZZLE_B = 0x8E44;
    int GL_TEXTURE_SWIZZLE_A = 0x8E45;
    int GL_GREEN = 0x1904;
    int GL_BLUE = 0x1905;
    int GL_INT_2_10_10_10_REV = 0x8D9F;
    int GL_TRANSFORM_FEEDBACK = 0x8E22;
    int GL_TRANSFORM_FEEDBACK_PAUSED = 0x8E23;
    int GL_TRANSFORM_FEEDBACK_ACTIVE = 0x8E24;
    int GL_TRANSFORM_FEEDBACK_BINDING = 0x8E25;
    int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;
    int GL_PROGRAM_BINARY_LENGTH = 0x8741;
    int GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE;
    int GL_PROGRAM_BINARY_FORMATS = 0x87FF;
    int GL_COMPRESSED_R11_EAC = 0x9270;
    int GL_COMPRESSED_SIGNED_R11_EAC = 0x9271;
    int GL_COMPRESSED_RG11_EAC = 0x9272;
    int GL_COMPRESSED_SIGNED_RG11_EAC = 0x9273;
    int GL_COMPRESSED_RGB8_ETC2 = 0x9274;
    int GL_COMPRESSED_SRGB8_ETC2 = 0x9275;
    int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9276;
    int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277;
    int GL_COMPRESSED_RGBA8_ETC2_EAC = 0x9278;
    int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9279;
    int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;
    int GL_MAX_ELEMENT_INDEX = 0x8D6B;
    int GL_NUM_SAMPLE_COUNTS = 0x9380;
    int GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;

    void glReadBuffer(int mode);

    void glDrawRangeElements(int mode, int start, int end, int count, int type, Buffer indices);

    void glDrawRangeElements(int mode, int start, int end, int count, int type, int offset);

    void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format,
                      int type, Buffer pixels);

    void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format,
                      int type, int offset);

    void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth,
                         int format, int type, Buffer pixels);

    void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth,
                         int format, int type, int offset);

    void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width,
                             int height);

    void glGenQueries(int n, int[] ids, int offset);

    void glGenQueries(int n, IntBuffer ids);

    void glDeleteQueries(int n, int[] ids, int offset);

    void glDeleteQueries(int n, IntBuffer ids);

    boolean glIsQuery(int id);

    void glBeginQuery(int target, int id);

    void glEndQuery(int target);

    void glGetQueryiv(int target, int pname, IntBuffer params);

    void glGetQueryObjectuiv(int id, int pname, IntBuffer params);

    boolean glUnmapBuffer(int target);

    Buffer glGetBufferPointerv(int target, int pname);

    void glDrawBuffers(int n, IntBuffer bufs);

    void glUniformMatrix2x3fv(int location, int count, boolean transpose, FloatBuffer value);

    void glUniformMatrix3x2fv(int location, int count, boolean transpose, FloatBuffer value);

    void glUniformMatrix2x4fv(int location, int count, boolean transpose, FloatBuffer value);

    void glUniformMatrix4x2fv(int location, int count, boolean transpose, FloatBuffer value);

    void glUniformMatrix3x4fv(int location, int count, boolean transpose, FloatBuffer value);

    void glUniformMatrix4x3fv(int location, int count, boolean transpose, FloatBuffer value);

    void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1,
                           int mask, int filter);

    void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height);

    void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer);

    Buffer glMapBufferRange(int target, int offset, int length, int access);

    void glFlushMappedBufferRange(int target, int offset, int length);

    void glBindVertexArray(int array);

    void glDeleteVertexArrays(int n, int[] arrays, int offset);

    void glDeleteVertexArrays(int n, IntBuffer arrays);

    void glGenVertexArrays(int n, int[] arrays, int offset);

    void glGenVertexArrays(int n, IntBuffer arrays);

    boolean glIsVertexArray(int array);

    void glBeginTransformFeedback(int primitiveMode);

    void glEndTransformFeedback();

    void glBindBufferRange(int target, int index, int buffer, int offset, int size);

    void glBindBufferBase(int target, int index, int buffer);

    void glTransformFeedbackVaryings(int program, String[] varyings, int bufferMode);

    void glVertexAttribIPointer(int index, int size, int type, int stride, int offset);

    void glGetVertexAttribIiv(int index, int pname, IntBuffer params);

    void glGetVertexAttribIuiv(int index, int pname, IntBuffer params);

    void glVertexAttribI4i(int index, int x, int y, int z, int w);

    void glVertexAttribI4ui(int index, int x, int y, int z, int w);

    void glGetUniformuiv(int program, int location, IntBuffer params);

    int glGetFragDataLocation(int program, String name);

    void glUniform1uiv(int location, int count, IntBuffer value);

    void glUniform3uiv(int location, int count, IntBuffer value);

    void glUniform4uiv(int location, int count, IntBuffer value);

    void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value);

    void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value);

    void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value);

    void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil);

    String glGetStringi(int name, int index);

    void glCopyBufferSubData(int readTarget, int writeTarget, int readOffset, int writeOffset, int size);

    void glGetUniformIndices(int program, String[] uniformNames, IntBuffer uniformIndices);

    void glGetActiveUniformsiv(int program, int uniformCount, IntBuffer uniformIndices, int pname,
                               IntBuffer params);

    int glGetUniformBlockIndex(int program, String uniformBlockName);

    void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params);

    void glGetActiveUniformBlockName(int program, int uniformBlockIndex, Buffer length,
                                     Buffer uniformBlockName);

    String glGetActiveUniformBlockName(int program, int uniformBlockIndex);

    void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding);

    void glDrawArraysInstanced(int mode, int first, int count, int instanceCount);

    void glDrawElementsInstanced(int mode, int count, int type, int indicesOffset, int instanceCount);

    void glGetInteger64v(int pname, LongBuffer params);

    void glGetBufferParameteri64v(int target, int pname, LongBuffer params);

    void glGenSamplers(int count, int[] samplers, int offset);

    void glGenSamplers(int count, IntBuffer samplers);

    void glDeleteSamplers(int count, int[] samplers, int offset);

    void glDeleteSamplers(int count, IntBuffer samplers);

    boolean glIsSampler(int sampler);

    void glBindSampler(int unit, int sampler);

    void glSamplerParameteri(int sampler, int pname, int param);

    void glSamplerParameteriv(int sampler, int pname, IntBuffer param);

    void glSamplerParameterf(int sampler, int pname, float param);

    void glSamplerParameterfv(int sampler, int pname, FloatBuffer param);

    void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params);

    void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params);

    void glVertexAttribDivisor(int index, int divisor);

    void glBindTransformFeedback(int target, int id);

    void glDeleteTransformFeedbacks(int n, int[] ids, int offset);

    void glDeleteTransformFeedbacks(int n, IntBuffer ids);

    void glGenTransformFeedbacks(int n, int[] ids, int offset);

    void glGenTransformFeedbacks(int n, IntBuffer ids);

    boolean glIsTransformFeedback(int id);

    void glPauseTransformFeedback();

    void glResumeTransformFeedback();

    void glProgramParameteri(int program, int pname, int value);

    void glInvalidateFramebuffer(int target, int numAttachments, IntBuffer attachments);

    void glInvalidateSubFramebuffer(int target, int numAttachments, IntBuffer attachments, int x, int y,
                                    int width, int height);

    /**
     * In OpenGl core profiles (3.1+), passing a pointer to client memory is not valid.
     * Use the other version of this function instead, pass a zero-based offset which references
     * the buffer currently bound to GL_ARRAY_BUFFER.
     */
    @Override
    void glVertexAttribPointer(int indx, int size, int type, boolean normalized, int stride, Buffer ptr);
}