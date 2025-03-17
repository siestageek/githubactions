package com.example.zzyzzy.semiprojectv1.service;

import com.example.zzyzzy.semiprojectv1.domain.GalleryImageDTO;
import com.example.zzyzzy.semiprojectv1.domain.GalleryListDTO;
import com.example.zzyzzy.semiprojectv1.domain.GalleryViewDTO;
import com.example.zzyzzy.semiprojectv1.domain.NewGalleryDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface GalleryService {

    List<GalleryListDTO> selectGallery();

    GalleryImageDTO readOneGalleryImage(int gno);

    boolean newGalleryImage(NewGalleryDTO gal, List<MultipartFile> ginames);
}
