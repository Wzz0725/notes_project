package com.senior.blog.controller;

import static com.senior.blog.constant.OptTypeConst.REMOVE;
import static com.senior.blog.constant.OptTypeConst.SAVE;
import static com.senior.blog.constant.OptTypeConst.UPDATE;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.senior.blog.annotation.OptLog;
import com.senior.blog.dto.PhotoBackDTO;
import com.senior.blog.dto.PhotoDTO;
import com.senior.blog.service.PhotoService;
import com.senior.blog.vo.ConditionVO;
import com.senior.blog.vo.DeleteVO;
import com.senior.blog.vo.PageResult;
import com.senior.blog.vo.PhotoInfoVO;
import com.senior.blog.vo.PhotoVO;
import com.senior.blog.vo.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 照片控制器
 *
 * @author senior
 */
@Api(tags = "照片模块")
@RestController
public class PhotoController {
    @Autowired
    private PhotoService photoService;

    /**
     * 获取后台照片列表
     *
     * @param condition 条件
     * @return {@link Result<PhotoBackDTO>} 照片列表
     */
    @ApiOperation(value = "根据相册id获取照片列表")
    @GetMapping("/admin/photos")
    public Result<PageResult<PhotoBackDTO>> listPhotos(ConditionVO condition) {
        return Result.ok(photoService.listPhotos(condition));
    }

    /**
     * 更新照片信息
     *
     * @param photoInfoVO 照片信息
     * @return {@link Result}
     */
    @OptLog(optType = UPDATE)
    @ApiOperation(value = "更新照片信息")
    @PutMapping("/admin/photos")
    public Result<?> updatePhoto(@Valid @RequestBody PhotoInfoVO photoInfoVO) {
        photoService.updatePhoto(photoInfoVO);
        return Result.ok();
    }

    /**
     * 保存照片
     *
     * @param photoVO 照片
     * @return {@link Result<>}
     */
    @OptLog(optType = SAVE)
    @ApiOperation(value = "保存照片")
    @PostMapping("/admin/photos")
    public Result<?> savePhotos(@Valid @RequestBody PhotoVO photoVO) {
        photoService.savePhotos(photoVO);
        return Result.ok();
    }

    /**
     * 移动照片相册
     *
     * @param photoVO 照片信息
     * @return {@link Result<>}
     */
    @OptLog(optType = UPDATE)
    @ApiOperation(value = "移动照片相册")
    @PutMapping("/admin/photos/album")
    public Result<?> updatePhotosAlbum(@Valid @RequestBody PhotoVO photoVO) {
        photoService.updatePhotosAlbum(photoVO);
        return Result.ok();
    }

    /**
     * 更新照片删除状态
     *
     * @param deleteVO 删除信息
     * @return {@link Result<>}
     */
    @OptLog(optType = UPDATE)
    @ApiOperation(value = "更新照片删除状态")
    @PutMapping("/admin/photos/delete")
    public Result<?> updatePhotoDelete(@Valid @RequestBody DeleteVO deleteVO) {
        photoService.updatePhotoDelete(deleteVO);
        return Result.ok();
    }

    /**
     * 删除照片
     *
     * @param photoIdList 照片id列表
     * @return {@link Result<>}
     */
    @OptLog(optType = REMOVE)
    @ApiOperation(value = "删除照片")
    @DeleteMapping("/admin/photos")
    public Result<?> deletePhotos(@RequestBody List<Integer> photoIdList) {
        photoService.deletePhotos(photoIdList);
        return Result.ok();
    }

    /**
     * 根据相册id查看照片列表
     *
     * @param albumId 相册id
     * @return {@link Result<PhotoDTO>} 照片列表
     */
    @ApiOperation(value = "根据相册id查看照片列表")
    @GetMapping("/albums/{albumId}/photos")
    public Result<PhotoDTO> listPhotosByAlbumId(@PathVariable("albumId") Integer albumId) {
        return Result.ok(photoService.listPhotosByAlbumId(albumId));
    }

}