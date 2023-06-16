package com.senior.blog.controller;

import static com.senior.blog.constant.OptTypeConst.REMOVE;
import static com.senior.blog.constant.OptTypeConst.SAVE_OR_UPDATE;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.senior.blog.annotation.OptLog;
import com.senior.blog.dto.PhotoAlbumBackDTO;
import com.senior.blog.dto.PhotoAlbumDTO;
import com.senior.blog.service.PhotoAlbumService;
import com.senior.blog.vo.ConditionVO;
import com.senior.blog.vo.PageResult;
import com.senior.blog.vo.PhotoAlbumVO;
import com.senior.blog.vo.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * 相册控制器
 *
 * @author senior
 */
@Api(tags = "相册模块")
@RestController
public class PhotoAlbumController {
    @Autowired
    private PhotoAlbumService photoAlbumService;

    /**
     * 保存或更新相册
     *
     * @param photoAlbumVO 相册信息
     * @return {@link Result<>}
     */
    @OptLog(optType = SAVE_OR_UPDATE)
    @ApiOperation(value = "保存或更新相册")
    @PostMapping("/admin/photos/albums")
    public Result<?> saveOrUpdatePhotoAlbum(@Valid @RequestBody PhotoAlbumVO photoAlbumVO) {
        photoAlbumService.saveOrUpdatePhotoAlbum(photoAlbumVO);
        return Result.ok();
    }

    /**
     * 查看后台相册列表
     *
     * @param condition 条件
     * @return {@link Result<PhotoAlbumBackDTO>} 相册列表
     */
    @ApiOperation(value = "查看后台相册列表")
    @GetMapping("/admin/photos/albums")
    public Result<PageResult<PhotoAlbumBackDTO>> listPhotoAlbumBacks(ConditionVO condition) {
        return Result.ok(photoAlbumService.listPhotoAlbumBacks(condition));
    }

    /**
     * 获取后台相册列表信息
     *
     * @return {@link Result<PhotoAlbumDTO>} 相册列表信息
     */
    @ApiOperation(value = "获取后台相册列表信息")
    @GetMapping("/admin/photos/albums/info")
    public Result<List<PhotoAlbumDTO>> listPhotoAlbumBackInfos() {
        return Result.ok(photoAlbumService.listPhotoAlbumBackInfos());
    }

    /**
     * 根据id获取后台相册信息
     *
     * @param albumId 相册id
     * @return {@link Result}相册信息
     */
    @ApiOperation(value = "根据id获取后台相册信息")
    @ApiImplicitParam(name = "albumId", value = "相册id", required = true, dataType = "Integer")
    @GetMapping("/admin/photos/albums/{albumId}/info")
    public Result<PhotoAlbumBackDTO> getPhotoAlbumBackById(@PathVariable("albumId") Integer albumId) {
        return Result.ok(photoAlbumService.getPhotoAlbumBackById(albumId));
    }

    /**
     * 根据id删除相册
     *
     * @param albumId 相册id
     * @return {@link Result}
     */
    @OptLog(optType = REMOVE)
    @ApiOperation(value = "根据id删除相册")
    @ApiImplicitParam(name = "albumId", value = "相册id", required = true, dataType = "Integer")
    @DeleteMapping("/admin/photos/albums/{albumId}")
    public Result<?> deletePhotoAlbumById(@PathVariable("albumId") Integer albumId) {
        photoAlbumService.deletePhotoAlbumById(albumId);
        return Result.ok();
    }

    /**
     * 获取相册列表
     *
     * @return {@link Result<PhotoAlbumDTO>} 相册列表
     */
    @ApiOperation(value = "获取相册列表")
    @GetMapping("/photos/albums")
    public Result<List<PhotoAlbumDTO>> listPhotoAlbums() {
        return Result.ok(photoAlbumService.listPhotoAlbums());
    }

}
